package Lambdas.MessageDisplay;

public class MessageGenerator {

    public static void main(String[] args) {

        MessageDisplay messageDisplay = new MessageDisplay() {

            String title;

            @Override
            public void setTitle(String title) {
                this.title = title;
            }

            @Override
            public void displayMessage() {
                System.out.println(title + " world");
            }
        };

        messageDisplay.setTitle("Hello");
        messageDisplay.displayMessage();

//        ErrorDisplay errorDisplay = new ErrorDisplay() {
//            @Override
//            public void displayError() {
//                System.out.println("Error happened");
//                System.out.println("error number 999");
//            }
//        };

        ErrorDisplay errorDisplay = () -> {
            System.out.println("Error happened");
        };

        errorDisplay.displayError();

//        ErrorDisplayAdvanced errorDisplayAdvanced = new ErrorDisplayAdvanced() {
//            @Override
//            public void displayMessage(ErrorCodes codes) {
//
//            }
//        };

        ErrorDisplayAdvanced errorDisplayAdvanced = (errorCode) -> {
            if(errorCode.equals(ErrorCodes.NOTFOUND)) {
                System.out.println("no data found");
            } else if (errorCode.equals(ErrorCodes.INVALIDINPUT)) {
                System.out.println("please try again");
            }
        };

        ErrorCodes error = ErrorCodes.NOTFOUND;
        errorDisplayAdvanced.displayMessage(error);
    }
}
