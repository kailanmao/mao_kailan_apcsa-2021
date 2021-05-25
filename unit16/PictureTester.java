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
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
	  Picture flower = new Picture("flower2.jpg");
	  flower.mirrorVerticalRightToLeft();
	  flower.explore();
  }
  
  public static void testMirrorHorizontal()
  {
	  Picture swan = new Picture("swan.jpg");
	  swan.mirrorHorizontal();
	  swan.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
	  Picture swan = new Picture("swan.jpg");
	  swan.mirrorHorizontalBotToTop();
	  swan.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture snowman = new Picture("snowman.jpg");
    snowman.mirrorArms();
    snowman.explore();
  }
  
  public static void testMirrorGull()
  {
    Picture gull = new Picture("seagull.jpg");
  	gull.mirrorGull();
  	gull.explore();
  }
  
  public static void testCopy()
  {
    Picture kitten = new Picture("kitten2.jpg");
    Picture robot = new Picture("robot.jpg");
    kitten.copy(robot,0,50,50,100);
    kitten.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
	  Picture kitten = new Picture("kitten2.jpg");
	  kitten.keepOnlyBlue();
	  kitten.explore();
  }
  
  public static void testNegate()
  {
	  Picture snowman = new Picture("snowman.jpg");
	  snowman.negate();
	  snowman.explore();
  }
  
  public static void testGrayscale()
  {
	  Picture barbara = new Picture("barbaraS.jpg");
	  barbara.grayscale();
	  barbara.explore();
  }
  
  public static void testFixUnderwater()
  {
	  Picture water = new Picture("water.jpg");
	  water.fixUnderwater();
	  water.explore();
  }
  
  public static void testMyCollage()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.myCollage();
	  beach.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
	//testMyCollage();
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
	testMirrorHorizontal();
	//testMirrorHorizontalBotToTop();
	//testMirrorVerticalRightToLeft();  
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
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
  }
}