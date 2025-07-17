package SingletonPattern;

import java.io.Serializable;

public class MySingletonAgain implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;

    private static class Holder{
        private static final MySingletonAgain INSTANCE = new MySingletonAgain();
    }

    private MySingletonAgain(){
        //making it reflection proof
        throw new RuntimeException("Use getInstance() method for instance creation.");
    }

    public static MySingletonAgain getInstance(){
        return Holder.INSTANCE;
    }

//making serializable safe
    protected Object readResolve(){
        return getInstance();
    }

//making cloneable proof
    protected Object clone() throws CloneNotSupportedException{
            throw new CloneNotSupportedException("cloning of this singleton is not allowed");
    }
}

//What happens here, the instance will be created only once when the inner static class is loaded, when getInstance() is called.
//The INSTANCE will be created once and only once and the same instance will be returned whenever requested.


