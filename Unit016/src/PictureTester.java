/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("src/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("src/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("src/redMotorcycle.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }
  public static void testMirrorHorizontalBotToTop()
  {
    Picture caterpillar = new Picture("src/redMotorcycle.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalBotToTop();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("src/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("src/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  public static void testMirrorArms()
  {
    Picture temple = new Picture("src/snowman.jpg");
    temple.explore();
    temple.mirrorArms();
    temple.explore();
  }
  public static void testMirrorGull()
  {
    Picture temple = new Picture("src/seagull.jpg");
    temple.explore();
    temple.mirrorGull();
    temple.explore();
  }
  public static void testKeepOnlyBlue() {
	  Picture temple = new Picture("src/temple.jpg");
	  temple.explore();
	  temple.keepOnlyBlue();
	  temple.explore();
  }
  
  public static void testNegate() {
	  Picture temple = new Picture("src/temple.jpg");
	  temple.explore();
	  temple.negate();
	  temple.explore();
  }
  public static void testGrayscale() {
	  Picture temple = new Picture("src/temple.jpg");
	  temple.explore();
	  temple.grayscale();
	  temple.explore();
  }
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("src/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  public static void testFixUnderwater()
  {
    Picture canvas = new Picture("src/water.jpg");
    canvas.fixUnderwater();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("src/swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  public static void testMirrorDiagonal()
  {
    Picture beach = new Picture("src/beach.jpg");
    beach.mirrorDiagonal();
    beach.explore();
  }
  public static void testCopy() {
	  Picture flower1 = new Picture("src/flower1.jpg");
	  Picture flower2 = new Picture("src/flower2.jpg");
	  flower1.copy(flower1,0,0, 100, 100);
	  flower1.copy(flower2,0,0, 60, 69);
	  Picture flowerNoBlue = new Picture(flower2);
	  flowerNoBlue.zeroBlue();
	  flower1.copy(flowerNoBlue,0,0, 15, 15);
	  flower1.write("src/collage.jpg");
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
   testNegate();
    testGrayscale();
    //testFixUnderwater();
    /*
	  testMirrorVertical();
    testMirrorVerticalRightToLeft();
    testMirrorHorizontal();
    testMirrorHorizontalBotToTop();
    */

	  testMirrorGull();

	//testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
    //Picture p = new Picture();
    //p.myCollage();
  }
}