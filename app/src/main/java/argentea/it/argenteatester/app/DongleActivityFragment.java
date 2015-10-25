package argentea.it.argenteatester.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class DongleActivityFragment extends Fragment {

    //NOTE FOR ASIF: for readability make the views member variable
    private Button mButtonPayment;

    private TextView mTextViewAmount;

    public DongleActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_dongle, container, false);

        mTextViewAmount = (TextView) rootView.findViewById(R.id.edittext_amount);

        mButtonPayment = (Button) rootView.findViewById(R.id.button_payment);
        mButtonPayment.setEnabled(false);

        mTextViewAmount.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(s.toString().equals("")){
                    mButtonPayment.setEnabled(false);
                }
                else {
                    mButtonPayment.setEnabled(true);
                }
            }
        });


        return rootView;
    }
}
