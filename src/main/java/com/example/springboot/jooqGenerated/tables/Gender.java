/*
 * This file is generated by jOOQ.
 */
package com.example.springboot.jooqGenerated.tables;


import com.example.springboot.jooqGenerated.Keys;
import com.example.springboot.jooqGenerated.Movies;
import com.example.springboot.jooqGenerated.tables.records.GenderRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Gender extends TableImpl<GenderRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>movies.gender</code>
     */
    public static final Gender GENDER = new Gender();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GenderRecord> getRecordType() {
        return GenderRecord.class;
    }

    /**
     * The column <code>movies.gender.gender_id</code>.
     */
    public final TableField<GenderRecord, Integer> GENDER_ID = createField(DSL.name("gender_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>movies.gender.gender</code>.
     */
    public final TableField<GenderRecord, String> GENDER_ = createField(DSL.name("gender"), SQLDataType.VARCHAR(20), this, "");

    private Gender(Name alias, Table<GenderRecord> aliased) {
        this(alias, aliased, null);
    }

    private Gender(Name alias, Table<GenderRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>movies.gender</code> table reference
     */
    public Gender(String alias) {
        this(DSL.name(alias), GENDER);
    }

    /**
     * Create an aliased <code>movies.gender</code> table reference
     */
    public Gender(Name alias) {
        this(alias, GENDER);
    }

    /**
     * Create a <code>movies.gender</code> table reference
     */
    public Gender() {
        this(DSL.name("gender"), null);
    }

    public <O extends Record> Gender(Table<O> child, ForeignKey<O, GenderRecord> key) {
        super(child, key, GENDER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Movies.MOVIES;
    }

    @Override
    public UniqueKey<GenderRecord> getPrimaryKey() {
        return Keys.KEY_GENDER_PRIMARY;
    }

    @Override
    public Gender as(String alias) {
        return new Gender(DSL.name(alias), this);
    }

    @Override
    public Gender as(Name alias) {
        return new Gender(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Gender rename(String name) {
        return new Gender(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Gender rename(Name name) {
        return new Gender(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}