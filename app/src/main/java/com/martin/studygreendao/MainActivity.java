package com.martin.studygreendao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.martin.studygreendao.entity.UserModel;
import com.martin.studygreendao.greendao.DaoSession;
import com.martin.studygreendao.greendao.UserModelDao;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button btnAdd;
    private Button btnDelete;
    private Button btnUpdate;
    private Button btnSearch;
    private TextView tvContent;

    private int userId = 0;
    private UserModelDao dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {

        dao = MyApplication.getInstances().getDaoSession().getUserModelDao();

        btnAdd = findViewById(R.id.btn_add);
        btnDelete = findViewById(R.id.btn_delete);
        btnUpdate = findViewById(R.id.btn_update);
        btnSearch = findViewById(R.id.btn_search);
        tvContent = findViewById(R.id.tv_content);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserModel model = new UserModel();
                model.setUserName("王小双" + userId);
                userId += 1;
                dao.insert(model);
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<UserModel> loadAll = dao.loadAll();
                if (loadAll.size() > 0) {
                    dao.deleteByKey(loadAll.get(0).getUId());
                }
            }
        });

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<UserModel> loadAll = dao.loadAll();
                if (loadAll.size() > 0) {
                    Long id = loadAll.get(0).getUId();
                    UserModel userModel = new UserModel();
                    userModel.setUId(id);
                    userModel.setUserName("改名叫 王双双");
                    dao.update(userModel);
                }
            }
        });

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<UserModel> list = dao.loadAll();
                StringBuilder buffer = new StringBuilder();
                buffer.append("开始查询数据\n");
                for (int i = 0; i < list.size(); i++) {
                    UserModel model = list.get(i);
                    buffer.append("id = ")
                            .append(model.getUId())
                            .append(" name = ")
                            .append(model.getUserName())
                            .append("\n");
                }
                tvContent.setText(buffer.toString());
            }
        });

    }
}
