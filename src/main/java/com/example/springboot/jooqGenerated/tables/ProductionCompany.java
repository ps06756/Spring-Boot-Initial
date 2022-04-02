/*
 * This file is generated by jOOQ.
 */
package com.example.springboot.jooqGenerated.tables;


import com.example.springboot.jooqGenerated.Keys;
import com.example.springboot.jooqGenerated.Movies;
import com.example.springboot.jooqGenerated.tables.records.ProductionCompanyRecord;

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
public class ProductionCompany extends TableImpl<ProductionCompanyRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>movies.production_company</code>
     */
    public static final ProductionCompany PRODUCTION_COMPANY = new ProductionCompany();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProductionCompanyRecord> getRecordType() {
        return ProductionCompanyRecord.class;
    }

    /**
     * The column <code>movies.production_company.company_id</code>.
     */
    public final TableField<ProductionCompanyRecord, Integer> COMPANY_ID = createField(DSL.name("company_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>movies.production_company.company_name</code>.
     */
    public final TableField<ProductionCompanyRecord, String> COMPANY_NAME = createField(DSL.name("company_name"), SQLDataType.VARCHAR(200), this, "");

    private ProductionCompany(Name alias, Table<ProductionCompanyRecord> aliased) {
        this(alias, aliased, null);
    }

    private ProductionCompany(Name alias, Table<ProductionCompanyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>movies.production_company</code> table reference
     */
    public ProductionCompany(String alias) {
        this(DSL.name(alias), PRODUCTION_COMPANY);
    }

    /**
     * Create an aliased <code>movies.production_company</code> table reference
     */
    public ProductionCompany(Name alias) {
        this(alias, PRODUCTION_COMPANY);
    }

    /**
     * Create a <code>movies.production_company</code> table reference
     */
    public ProductionCompany() {
        this(DSL.name("production_company"), null);
    }

    public <O extends Record> ProductionCompany(Table<O> child, ForeignKey<O, ProductionCompanyRecord> key) {
        super(child, key, PRODUCTION_COMPANY);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Movies.MOVIES;
    }

    @Override
    public UniqueKey<ProductionCompanyRecord> getPrimaryKey() {
        return Keys.KEY_PRODUCTION_COMPANY_PRIMARY;
    }

    @Override
    public ProductionCompany as(String alias) {
        return new ProductionCompany(DSL.name(alias), this);
    }

    @Override
    public ProductionCompany as(Name alias) {
        return new ProductionCompany(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ProductionCompany rename(String name) {
        return new ProductionCompany(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ProductionCompany rename(Name name) {
        return new ProductionCompany(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
