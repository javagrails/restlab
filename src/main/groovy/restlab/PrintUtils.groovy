package restlab
/**
 * Created by isalman on 7/16/2017.
 */


class PrintUtils {
    public static void printParams(def params, def requestJSON){
        println("=======================")
        println(params)
        println(requestJSON?.toString())
        println("=======================")
    }
}


