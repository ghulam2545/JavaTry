Compiled from "Main.java"
class LoL {
  public LoL(int, java.lang.String);
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iload_1
       6: putfield      #7                  // Field age:I
       9: aload_0
      10: aload_2
      11: putfield      #13                 // Field name:Ljava/lang/String;
      14: return

  public java.lang.String toString();
    Code:
       0: aload_0
       1: getfield      #13                 // Field name:Ljava/lang/String;
       4: aload_0
       5: getfield      #7                  // Field age:I
       8: invokedynamic #17,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
      13: areturn
}
