package night.saturday.live.mvpteast;

public class ManPresenterImp implements ManPresenter, GetQuoteInteractor.OnFinishedListerner {

    ManView manView;
    GetQuoteInteractor getQuoteInteractor;

    public ManPresenterImp(ManView manView, GetQuoteInteractor getQuoteInteractor) {
        this.manView = manView;
        this.getQuoteInteractor = getQuoteInteractor;
    }

    @Override
    public void onFinished(String ss) {
        if (manView != null) {
            manView.setQuote(ss);
            manView.hide_Progress();
        }
    }

    @Override
    public void btnClick() {
        if (manView != null) {
            manView.show_Progress();
        }
        getQuoteInteractor.getNextQuote(this);
    }

    @Override
    public void desTroy() {
        manView = null;
    }
}
