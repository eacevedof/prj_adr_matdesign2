package es.theframework.matdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import theframework.android.components.ComponentValidate;

public class EditTextValidation extends AppCompatActivity {

    private Button butLogin;
    private EditText edtNombre;
    private EditText edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text_validation);
    }

    public void login(View oView)
    {
        edtNombre = (EditText)findViewById(R.id.edtNombre);
        edtPassword = (EditText)findViewById(R.id.edtPassword);
        butLogin = (Button)findViewById(R.id.butLogin);

        String sNombre = edtNombre.getText().toString();
        String sPassword = edtPassword.getText().toString();

        if(ComponentValidate.is_len(sNombre,0)) {
            Toast.makeText(this, "Debes ingresar un nombre", Toast.LENGTH_LONG).show();
            return;
        }

        if(ComponentValidate.is_len(sPassword,0)) {
            Toast.makeText(this, "Debes ingresar un password", Toast.LENGTH_LONG).show();
            return;
        }

        Toast.makeText(this, "Registro en proceso", Toast.LENGTH_LONG).show();

    }//login

}//EditTextValidation
