package MediaBrowser.ApiInteraction;

public class Response<T> implements IResponse {

    private IResponse innerResponse;

    public Response(IResponse innerResponse){
        this.innerResponse = innerResponse;
    }

    public Response(){

    }

    public void onResponse()
    {

    }

    public void onResponse(T response)
    {

    }

    @Override
    public void onError()
    {
        if (innerResponse != null){
            innerResponse.onError();
        }
    }
}