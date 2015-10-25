package argentea.it.argenteatester.app;

import android.content.SharedPreferences;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceGroup;
import android.preference.PreferenceScreen;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A placeholder fragment containing a simple view.
 */
public class SettingsActivityFragment extends PreferenceFragment{

    public SettingsActivityFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.prefs);
    }

    @Override
    public void onResume() {
        super.onResume();

        /*PreferenceScreen preferenceScreen = getPreferenceScreen();
        for (int i=0; i < preferenceScreen.getPreferenceCount(); i++){
            Preference preference = preferenceScreen.getPreference(i);
            if(preference instanceof PreferenceGroup){
                PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
                for(int k = 0; k < preferenceGroup.getPreferenceCount(); k++){
                    updatePreference(preferenceGroup.getPreference(k));
                }
            }
            else {
                updatePreference(preference);
            }
        }*/

    }

    private void updatePreference(Preference preference){
        if(preference instanceof EditTextPreference){
            EditTextPreference editTextPreference = (EditTextPreference) preference;
            editTextPreference.setSummary(editTextPreference.getText());
        }
    }

    /*
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            return inflater.inflate(R.layout.fragment_settings, container, false);
        }
    */
}
