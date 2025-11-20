package fdu.secsys.microservice;

public class Config {

    // directory contains input jars

    public static String name = "";
    public static String jarPath = "../../cloud/yudao-cloud/jars";

    public static String[] classpathKeywords = new String[]{"cn.iocoder"};
    public static  String routeConfigFile = "";

    public static  String optionsFile = "src/main/resources/options-dev.yml";

    // directory jars unzipped to
    public static  String targetPath = "/tmp/test";

    public static boolean reuse = false;
}
