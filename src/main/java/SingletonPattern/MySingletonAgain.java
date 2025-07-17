package SingletonPattern;

import java.io.Serializable;

//This singleton class has a static inner class, which is responsible for creating instance.
//The inner class will be called when getInstance() method is called. So, follows lazy loading.
//Since the instance variable is final, it will be instantiated only once.
//Due to static inner class and final INSTANCE variable, there will be only one instance available so its threadsafe too
//Since we have implemented readResolve() which is returning the same INSTANCE, there won't be additional object is created while deserialization.
//Throwing exception from clone() to avoid cloning.
//Throwing exception from constructor to avoid tampering via reflection, so its reflection proof.

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


