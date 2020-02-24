package night.saturday.live.mvpteast;

public interface GetQuoteInteractor {

    interface OnFinishedListerner {
        void onFinished(String ss);
    }

    void getNextQuote(OnFinishedListerner listerner);
}
