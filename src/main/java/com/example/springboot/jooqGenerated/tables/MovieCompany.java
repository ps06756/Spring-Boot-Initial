/*
 * This file is generated by jOOQ.
 */
package com.example.springboot.jooqGenerated.tables;


import com.example.springboot.jooqGenerated.Keys;
import com.example.springboot.jooqGenerated.Movies;
import com.example.springboot.jooqGenerated.tables.records.MovieCompanyRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MovieCompany extends TableImpl<MovieCompanyRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>movies.movie_company</code>
     */
    public static final MovieCompany MOVIE_COMPANY = new MovieCompany();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MovieCompanyRecord> getRecordType() {
        return MovieCompanyRecord.class;
    }

    /**
     * The column <code>movies.movie_company.movie_id</code>.
     */
    public final TableField<MovieCompanyRecord, Integer> MOVIE_ID = createField(DSL.name("movie_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>movies.movie_company.company_id</code>.
     */
    public final TableField<MovieCompanyRecord, Integer> COMPANY_ID = createField(DSL.name("company_id"), SQLDataType.INTEGER, this, "");

    private MovieCompany(Name alias, Table<MovieCompanyRecord> aliased) {
        this(alias, aliased, null);
    }

    private MovieCompany(Name alias, Table<MovieCompanyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>movies.movie_company</code> table reference
     */
    public MovieCompany(String alias) {
        this(DSL.name(alias), MOVIE_COMPANY);
    }

    /**
     * Create an aliased <code>movies.movie_company</code> table reference
     */
    public MovieCompany(Name alias) {
        this(alias, MOVIE_COMPANY);
    }

    /**
     * Create a <code>movies.movie_company</code> table reference
     */
    public MovieCompany() {
        this(DSL.name("movie_company"), null);
    }

    public <O extends Record> MovieCompany(Table<O> child, ForeignKey<O, MovieCompanyRecord> key) {
        super(child, key, MOVIE_COMPANY);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Movies.MOVIES;
    }

    @Override
    public List<ForeignKey<MovieCompanyRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_MC_MOVIE, Keys.FK_MC_COMP);
    }

    private transient Movie _movie;
    private transient ProductionCompany _productionCompany;

    /**
     * Get the implicit join path to the <code>movies.movie</code> table.
     */
    public Movie movie() {
        if (_movie == null)
            _movie = new Movie(this, Keys.FK_MC_MOVIE);

        return _movie;
    }

    /**
     * Get the implicit join path to the <code>movies.production_company</code>
     * table.
     */
    public ProductionCompany productionCompany() {
        if (_productionCompany == null)
            _productionCompany = new ProductionCompany(this, Keys.FK_MC_COMP);

        return _productionCompany;
    }

    @Override
    public MovieCompany as(String alias) {
        return new MovieCompany(DSL.name(alias), this);
    }

    @Override
    public MovieCompany as(Name alias) {
        return new MovieCompany(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MovieCompany rename(String name) {
        return new MovieCompany(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MovieCompany rename(Name name) {
        return new MovieCompany(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}