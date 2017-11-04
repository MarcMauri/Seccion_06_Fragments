package app.android.mmauri.seccion_06_fragments.Activities;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import app.android.mmauri.seccion_06_fragments.Fragments.DataFragment;
import app.android.mmauri.seccion_06_fragments.Fragments.DetailsFragment;
import app.android.mmauri.seccion_06_fragments.R;

public class MainActivity extends FragmentActivity implements DataFragment.DataListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void sendData(String text) {
        /* Llamar al metodo renderizarTexto del DetailsFragment, pasando el texto que
           recibimos por parametro en este mismo metodo */

        DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.detailsFragment);
        detailsFragment.renderText(text);

    }
}
