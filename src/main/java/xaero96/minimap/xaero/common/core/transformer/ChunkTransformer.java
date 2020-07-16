/*    */ package xaero.common.core.transformer;
/*    */ 
/*    */ import org.objectweb.asm.tree.ClassNode;
/*    */ import org.objectweb.asm.tree.FieldNode;
/*    */ 
/*    */ 
/*    */ public class ChunkTransformer
/*    */   extends ClassNodeTransformer
/*    */ {
/*    */   public byte[] transform(String name, String transformedName, byte[] basicClass) {
/* 11 */     this.className = "net.minecraft.world.chunk.Chunk";
/* 12 */     return super.transform(name, transformedName, basicClass);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void transformNode(ClassNode classNode, boolean isObfuscated) {
/* 17 */     classNode.fields.add(new FieldNode(1, "xaero_chunkClean", "Z", null, Integer.valueOf(0)));
/*    */   }
/*    */ }


/* Location:              C:\Users\ioanm\Downloads\Xaeros_Minimap_20.15.3_Forge_1.12.jar!\xaero\common\core\transformer\ChunkTransformer.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */