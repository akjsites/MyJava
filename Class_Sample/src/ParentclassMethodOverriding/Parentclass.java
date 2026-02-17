package ParentclassMethodOverriding;

public class Parentclass {
    public void loadingClass(String x) throws ClassNotFoundException
    {
    	Class.forName(x);
    }
}
