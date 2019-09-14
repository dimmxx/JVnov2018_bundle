package conspect.logging.log1.utils;

public class ClazzNameUtil {

//    public ClazzNameUtil() {
//    }

    public static String getCurrentClazzName(){

        try {
            throw new RuntimeException();
        }catch (RuntimeException e){
            return e.getStackTrace()[1].getClassName();
        }
    }



}
