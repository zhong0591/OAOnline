package shinetech.android.com.oaonline;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class UserLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);
        Button loginBtn = (Button)findViewById(R.id.login_in);
        loginBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                //这里就可以判断账号密码是否正确了，这里让大家自己试验动手一下谢谢如果账号密码是admin 123456就成功
                //否则就提示登陆失败，大家试一试吧，我这里直接跳转了，没做验证

                //这个是直接跳转到MainActivity
                Intent intent = new Intent();
                intent.setClass(UserLoginActivity.this, MainActivity .class);
                startActivity(intent);
            }
        });
    }

}
