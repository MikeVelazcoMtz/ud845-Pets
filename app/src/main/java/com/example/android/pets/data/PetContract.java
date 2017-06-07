package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Contract class for database connection
 *
 * Created by Miguel Angel Velazco on 02/06/2017.
 */
public final class PetContract {

    private PetContract() {
    }

    /**
     * The Pets table configuration.
     */
    public static class PetEntry implements BaseColumns {
        public static final String TABLE_NAME = "pets";
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_NAME_NAME = "name";
        public static final String COLUMN_NAME_BREED = "breed";
        public static final String COLUMN_NAME_GENDER = "gender";
        public static final String COLUMN_NAME_WEIGHT = "weight";

        // Gender options
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;

    }
}
