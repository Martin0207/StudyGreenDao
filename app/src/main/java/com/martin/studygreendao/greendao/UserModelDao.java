package com.martin.studygreendao.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.martin.studygreendao.entity.UserModel;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "USER_MODEL".
*/
public class UserModelDao extends AbstractDao<UserModel, Long> {

    public static final String TABLENAME = "USER_MODEL";

    /**
     * Properties of entity UserModel.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property UserName = new Property(1, String.class, "userName", false, "USER_NAME");
        public final static Property Gender = new Property(2, String.class, "gender", false, "GENDER");
        public final static Property Age = new Property(3, String.class, "age", false, "AGE");
        public final static Property Count = new Property(4, int.class, "count", false, "COUNT");
        public final static Property CanUpdate = new Property(5, boolean.class, "canUpdate", false, "CAN_UPDATE");
        public final static Property Test0 = new Property(6, String.class, "test0", false, "TEST0");
        public final static Property Test1 = new Property(7, Boolean.class, "test1", false, "TEST1");
        public final static Property Test2 = new Property(8, Integer.class, "test2", false, "TEST2");
        public final static Property Test3 = new Property(9, int.class, "test3", false, "TEST3");
        public final static Property Test4 = new Property(10, int.class, "test4", false, "TEST4");
        public final static Property Test5 = new Property(11, double.class, "test5", false, "TEST5");
        public final static Property Test6 = new Property(12, float.class, "test6", false, "TEST6");
    }


    public UserModelDao(DaoConfig config) {
        super(config);
    }
    
    public UserModelDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"USER_MODEL\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"USER_NAME\" TEXT," + // 1: userName
                "\"GENDER\" TEXT," + // 2: gender
                "\"AGE\" TEXT," + // 3: age
                "\"COUNT\" INTEGER NOT NULL ," + // 4: count
                "\"CAN_UPDATE\" INTEGER NOT NULL ," + // 5: canUpdate
                "\"TEST0\" TEXT," + // 6: test0
                "\"TEST1\" INTEGER," + // 7: test1
                "\"TEST2\" INTEGER," + // 8: test2
                "\"TEST3\" INTEGER NOT NULL ," + // 9: test3
                "\"TEST4\" INTEGER NOT NULL ," + // 10: test4
                "\"TEST5\" REAL NOT NULL ," + // 11: test5
                "\"TEST6\" REAL NOT NULL );"); // 12: test6
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"USER_MODEL\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, UserModel entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String userName = entity.getUserName();
        if (userName != null) {
            stmt.bindString(2, userName);
        }
 
        String gender = entity.getGender();
        if (gender != null) {
            stmt.bindString(3, gender);
        }
 
        String age = entity.getAge();
        if (age != null) {
            stmt.bindString(4, age);
        }
        stmt.bindLong(5, entity.getCount());
        stmt.bindLong(6, entity.getCanUpdate() ? 1L: 0L);
 
        String test0 = entity.getTest0();
        if (test0 != null) {
            stmt.bindString(7, test0);
        }
 
        Boolean test1 = entity.getTest1();
        if (test1 != null) {
            stmt.bindLong(8, test1 ? 1L: 0L);
        }
 
        Integer test2 = entity.getTest2();
        if (test2 != null) {
            stmt.bindLong(9, test2);
        }
        stmt.bindLong(10, entity.getTest3());
        stmt.bindLong(11, entity.getTest4());
        stmt.bindDouble(12, entity.getTest5());
        stmt.bindDouble(13, entity.getTest6());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, UserModel entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String userName = entity.getUserName();
        if (userName != null) {
            stmt.bindString(2, userName);
        }
 
        String gender = entity.getGender();
        if (gender != null) {
            stmt.bindString(3, gender);
        }
 
        String age = entity.getAge();
        if (age != null) {
            stmt.bindString(4, age);
        }
        stmt.bindLong(5, entity.getCount());
        stmt.bindLong(6, entity.getCanUpdate() ? 1L: 0L);
 
        String test0 = entity.getTest0();
        if (test0 != null) {
            stmt.bindString(7, test0);
        }
 
        Boolean test1 = entity.getTest1();
        if (test1 != null) {
            stmt.bindLong(8, test1 ? 1L: 0L);
        }
 
        Integer test2 = entity.getTest2();
        if (test2 != null) {
            stmt.bindLong(9, test2);
        }
        stmt.bindLong(10, entity.getTest3());
        stmt.bindLong(11, entity.getTest4());
        stmt.bindDouble(12, entity.getTest5());
        stmt.bindDouble(13, entity.getTest6());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public UserModel readEntity(Cursor cursor, int offset) {
        UserModel entity = new UserModel( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // userName
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // gender
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // age
            cursor.getInt(offset + 4), // count
            cursor.getShort(offset + 5) != 0, // canUpdate
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // test0
            cursor.isNull(offset + 7) ? null : cursor.getShort(offset + 7) != 0, // test1
            cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8), // test2
            cursor.getInt(offset + 9), // test3
            cursor.getInt(offset + 10), // test4
            cursor.getDouble(offset + 11), // test5
            cursor.getFloat(offset + 12) // test6
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, UserModel entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setUserName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setGender(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setAge(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setCount(cursor.getInt(offset + 4));
        entity.setCanUpdate(cursor.getShort(offset + 5) != 0);
        entity.setTest0(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setTest1(cursor.isNull(offset + 7) ? null : cursor.getShort(offset + 7) != 0);
        entity.setTest2(cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8));
        entity.setTest3(cursor.getInt(offset + 9));
        entity.setTest4(cursor.getInt(offset + 10));
        entity.setTest5(cursor.getDouble(offset + 11));
        entity.setTest6(cursor.getFloat(offset + 12));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(UserModel entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(UserModel entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(UserModel entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
