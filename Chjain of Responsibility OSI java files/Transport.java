public class Transport implements Chain{
    private Chain nextInChain;
    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void process(Data request) {

        if (request.getData() != null){
            // Transport header is added
            // Called segment
            request.addData("+TransportHeader");
            nextInChain.process(request);
        }
        else {
            nextInChain.process(request);
        }
    }
}