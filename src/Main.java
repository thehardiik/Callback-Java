public class Main {
    public static void main(String[] args) {

        // Create instance of object MyCallback() which contains your callback method
        Callback callback = new MyCallback();

        // Execute the task with the callback
        addNumbers(callback);
    }

    // Custom method which takes callback as an argument
    public static void addNumbers(Callback callback){

        int a = 24;
        int b = 23;

        callback.onComplete("Hii");
    }
}


// implement this interface to define your callback function
interface Callback {
    void onComplete(String result);
}

// Example class to define custom callback function
class MyCallback implements Callback {

    @Override
    public void onComplete(String result) {
        // This is your custom callback function
        System.out.println("Callback received: " + result);
    }
}