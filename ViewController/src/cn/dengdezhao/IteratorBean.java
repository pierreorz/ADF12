package cn.dengdezhao;
import java.util.ArrayList;
import java.util.List;
public class IteratorBean {
    List list = new ArrayList();
    String[] values=new String[]{"1","2","3"};
    List<contentList> testList=new ArrayList<contentList>();

    public void setTestList(List<contentList> testList) {
        System.out.println("setTestList...");
        this.testList = testList;
    }

    public List<contentList> getTestList() {
        System.out.println("getTestList...");

        return testList;
    }

    public void setValues(String[] values) {
        this.values = values;
    }

    public String[] getValues() {
        return values;
    }


    public IteratorBean(){
        list.add("A");
        list.add("B");
        list.add("C");
        contentList a=new contentList();
        a.setTitle("aaa");
        testList.add(a);
        contentList b=new contentList();
        b.setTitle("bbb");
        testList.add(b);
        contentList c=new contentList();
        c.setTitle("ccc");
        testList.add(c);
        System.out.println("init...");
    }

    public void setList(List list) {
        System.out.println("setList ...");
        this.list = list;
    }

    public List getList() {
        System.out.println("getList...");
        return list;
    }

    public String action() {
        // Add event code here...
        System.out.println("size:"+values.length);
        if(values!=null&&values.length==3){
            System.out.println("values[0]:"+this.values[0]);
            System.out.println("values[1]:"+this.values[1]);
            System.out.println("values[2]:"+this.values[2]);
        }
 
        return null;
    }
}
