package com.martin.studygreendao.greendao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.github.yuweiguocn.library.greendao.MigrationHelper;
import com.martin.studygreendao.greendao.DaoMaster;
import com.martin.studygreendao.greendao.UserModelDao;

import org.greenrobot.greendao.database.Database;

/**
 * 作者：Martin on 2018/1/24 14:34
 * 邮箱：martin0207mfh@163.com
 */
public class UpDateDaoHelper extends DaoMaster.OpenHelper {

    public UpDateDaoHelper(Context context, String name) {
        super(context, name);
    }

    public UpDateDaoHelper(Context context, String name, SQLiteDatabase.CursorFactory factory) {
        super(context, name, factory);
    }

    @Override
    public void onUpgrade(Database db, int oldVersion, int newVersion) {
        MigrationHelper.migrate(db, new MigrationHelper.ReCreateAllTableListener() {

                    @Override
                    public void onCreateAllTables(Database db, boolean ifNotExists) {
                        DaoMaster.createAllTables(db, ifNotExists);
                    }

                    @Override
                    public void onDropAllTables(Database db, boolean ifExists) {
                        DaoMaster.dropAllTables(db, ifExists);
                    }
                }, UserModelDao.class
        );
    }
}
