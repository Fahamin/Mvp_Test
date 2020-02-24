package night.saturday.live.mvpteast;

import android.os.Handler;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.logging.LogRecord;

public class GetQuoteInteractorImpl implements GetQuoteInteractor {

    private List<String> arrayList = Arrays.asList(
            "Be yourself. everyone else is already taken.",
            "A room without books is like a body without a soul.",
            "You only live once, but if you do it right, once is enough.",
            "Be the change that you wish to see in the world.",
            "If you tell the truth, you don't have to remember anything."
    );
    @Override
    public void getNextQuote(final OnFinishedListerner listerner) {
     new Handler().postDelayed(new Runnable() {
         @Override
         public void run() {
             listerner.onFinished(getRandowString());
         }
     },100);

    }

    private String getRandowString() {
        Random random = new Random();
        int index = random.nextInt(arrayList.size());
        return  arrayList.get(index);
    }
}
