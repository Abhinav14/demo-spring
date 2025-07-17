package SingletonPattern;

public class MySingletonAgain {
    private static class Holder{
        private static final MySingletonAgain INSTANCE = new MySingletonAgain();
    }

    private MySingletonAgain(){}

    public static MySingletonAgain getInstance(){
        return Holder.INSTANCE;
    }
}

//What happens here, the instance will be created only once when the inner static class is loaded, when getInstance() is called.
//The INSTANCE will be created once and only once and the same instance will be returned whenever requested.
