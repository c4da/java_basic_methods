public class Tools(){
  
      public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static boolean stringContainsIllegalChars(String s){
        for (char ch:s.toCharArray()){
            if (ch < 128){
                if (Character.isDigit(ch)){
                    continue;
                }
                return true;
            }
        }
        return false;
    }
  
  public static void saveBufferedImage(BufferedImage bufferedImage, String path, String fileName){
    File outputfile = new File(fileName+".jpg");
    ImageIO.write(bufferedImage, "jpg", outputfile);
  }
  
}
