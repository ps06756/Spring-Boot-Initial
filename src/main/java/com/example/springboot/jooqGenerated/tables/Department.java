/*
 * This file is generated by jOOQ.
 */
package com.example.springboot.jooqGenerated.tables;


import com.example.springboot.jooqGenerated.Keys;
import com.example.springboot.jooqGenerated.Movies;
import com.example.springboot.jooqGenerated.tables.records.DepartmentRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
public class Department extends TableImpl<DepartmentRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>movies.department</code>
     */
    public static final Department DEPARTMENT = new Department();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DepartmentRecord> getRecordType() {
        return DepartmentRecord.class;
    }

    /**
     * The column <code>movies.department.department_id</code>.
     */
    public final TableField<DepartmentRecord, Integer> DEPARTMENT_ID = createField(DSL.name("department_id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>movies.department.department_name</code>.
     */
    public final TableField<DepartmentRecord, String> DEPARTMENT_NAME = createField(DSL.name("department_name"), SQLDataType.VARCHAR(200), this, "");

    private Department(Name alias, Table<DepartmentRecord> aliased) {
        this(alias, aliased, null);
    }

    private Department(Name alias, Table<DepartmentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>movies.department</code> table reference
     */
    public Department(String alias) {
        this(DSL.name(alias), DEPARTMENT);
    }

    /**
     * Create an aliased <code>movies.department</code> table reference
     */
    public Department(Name alias) {
        this(alias, DEPARTMENT);
    }

    /**
     * Create a <code>movies.department</code> table reference
     */
    public Department() {
        this(DSL.name("department"), null);
    }

    public <O extends Record> Department(Table<O> child, ForeignKey<O, DepartmentRecord> key) {
        super(child, key, DEPARTMENT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Movies.MOVIES;
    }

    @Override
    public Identity<DepartmentRecord, Integer> getIdentity() {
        return (Identity<DepartmentRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<DepartmentRecord> getPrimaryKey() {
        return Keys.KEY_DEPARTMENT_PRIMARY;
    }

    @Override
    public Department as(String alias) {
        return new Department(DSL.name(alias), this);
    }

    @Override
    public Department as(Name alias) {
        return new Department(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Department rename(String name) {
        return new Department(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Department rename(Name name) {
        return new Department(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}