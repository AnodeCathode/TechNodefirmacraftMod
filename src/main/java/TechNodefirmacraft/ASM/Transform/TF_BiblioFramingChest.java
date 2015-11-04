package TechNodefirmacraft.ASM.Transform;



import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;

import static org.objectweb.asm.Opcodes.*;


public class TF_BiblioFramingChest  implements net.minecraft.launchwrapper.IClassTransformer
{
	public static final Logger LOG = LogManager.getLogger("TechNodefirmacraft ASM");

		private static final String[] classesBeingTransformed =
        {
                "jds.bibliocraft.tileentities.TileEntityFramedChest"
        };
		

	@Override
	public byte[] transform(String name, String transformedName, byte[] classBeingTransformed)
	{
	    boolean isObfuscated = !name.equals(transformedName);
	    int index = Arrays.asList(classesBeingTransformed).indexOf(transformedName);
	    return index != -1 ? transform(index, classBeingTransformed, isObfuscated) : classBeingTransformed;
	}

	 private static byte[] transform(int index, byte[] classBeingTransformed, boolean isObfuscated)
	    {
	        LOG.info("Transforming: " + classesBeingTransformed[index]);
	        try
	        {
	            ClassNode classNode = new ClassNode();
	            ClassReader classReader = new ClassReader(classBeingTransformed);
	            classReader.accept(classNode, 0);

	            switch(index)
	            {
	                case 0:
	                    transformBiblioFramingChest(classNode, isObfuscated);
	                    break;
	            }

	            ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES);
	            classNode.accept(classWriter);
	            return classWriter.toByteArray();
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	        return classBeingTransformed;
	    }

	private static void transformBiblioFramingChest(ClassNode classNode, boolean isObfuscated) {
		LOG.info("Found class. Hunting for method.");
		final String ENTITY_COLLIDE = "func_145845_h";
        final String ENTITY_COLLIDE_DESC = "()V";

		/* Instructions we need to find:
		 * 	mv.visitVarInsn(ALOAD, 0);
			mv.visitInsn(ICONST_0);
			mv.visitFieldInsn(PUTFIELD, "jds/bibliocraft/tileentities/TileEntityFramedChest", "numPlayersUsing", "I");
		 */
        
        
        /*	Need to add this: To tick the chest for heat and decay
				mv.visitVarInsn(ALOAD, 0);
				mv.visitVarInsn(ALOAD, 0);
				mv.visitFieldInsn(GETFIELD, "jds/bibliocraft/tileentities/TileEntityFramedChest", "worldObj", "Lnet/minecraft/world/World;");
				mv.visitVarInsn(ALOAD, 0);
				mv.visitFieldInsn(GETFIELD, "jds/bibliocraft/tileentities/TileEntityFramedChest", "xCoord", "I");
				mv.visitVarInsn(ALOAD, 0);
				mv.visitFieldInsn(GETFIELD, "jds/bibliocraft/tileentities/TileEntityFramedChest", "yCoord", "I");
				mv.visitVarInsn(ALOAD, 0);
				mv.visitFieldInsn(GETFIELD, "jds/bibliocraft/tileentities/TileEntityFramedChest", "zCoord", "I");
				mv.visitMethodInsn(INVOKESTATIC, "com/bioxx/tfc/Core/TFC_Core", "handleItemTicking", "(Lnet/minecraft/inventory/IInventory;Lnet/minecraft/world/World;III)V", false);
		*/		
        for (MethodNode method : classNode.methods)
        {

        	if (method.name.equals(ENTITY_COLLIDE) && method.desc.equals(ENTITY_COLLIDE_DESC))
            {
               LOG.info("Found our method");
            	AbstractInsnNode targetNode = null;
                for (AbstractInsnNode instruction : method.instructions.toArray())
                {
                    if (instruction.getOpcode() == ALOAD)
                    {
                        if (((VarInsnNode) instruction).var == 0 && instruction.getNext().getOpcode() == ICONST_0)
                        {
                            targetNode = instruction;
                            LOG.info("Found target instruction");
                            break;
                        }
                    }
                }
                if (targetNode != null )
                {
                    
                    InsnList toInsert = new InsnList();
                    toInsert.add(new VarInsnNode(ALOAD, 0));
                    toInsert.add(new VarInsnNode(ALOAD, 0));
                    toInsert.add(new FieldInsnNode(GETFIELD, "jds/bibliocraft/tileentities/TileEntityFramedChest", "field_145850_b" , "Lnet/minecraft/world/World;"));
                    toInsert.add(new VarInsnNode(ALOAD, 0));
                    toInsert.add(new FieldInsnNode(GETFIELD,"jds/bibliocraft/tileentities/TileEntityFramedChest", "field_145851_c", "I"));
                    toInsert.add(new VarInsnNode(ALOAD, 0));
                    toInsert.add(new FieldInsnNode(GETFIELD,"jds/bibliocraft/tileentities/TileEntityFramedChest", "field_145848_d", "I"));
                    toInsert.add(new VarInsnNode(ALOAD, 0));
                    toInsert.add(new FieldInsnNode(GETFIELD,"jds/bibliocraft/tileentities/TileEntityFramedChest", "field_145849_e", "I"));
                    toInsert.add(new MethodInsnNode(Opcodes.INVOKESTATIC, "com/bioxx/tfc/Core/TFC_Core","handleItemTicking","(Lnet/minecraft/inventory/IInventory;Lnet/minecraft/world/World;III)V", false));
                    method.instructions.insertBefore(targetNode,toInsert);
                    LOG.info("Done terrible things to that method. Working?");


                    //method.instructions.insert(popNode, newLabelNode);
                }
                else
                {
                    LOG.error("Something went wrong transforming TileEntityFramedChest!");
                }
            }
        }
    }

}