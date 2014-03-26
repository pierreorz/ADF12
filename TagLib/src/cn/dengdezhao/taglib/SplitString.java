package cn.dengdezhao.taglib;

public  class SplitString {

    public static String getString(String string) {
        String[] strings = string.split(":", 3);
        if (strings.length > 2) {
            return strings[2];
        } else {
            return "";
        }
    }

}
