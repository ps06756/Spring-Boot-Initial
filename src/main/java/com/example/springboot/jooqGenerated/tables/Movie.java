/*
 * This file is generated by jOOQ.
 */
package com.example.springboot.jooqGenerated.tables;


import com.example.springboot.jooqGenerated.Keys;
import com.example.springboot.jooqGenerated.Movies;
import com.example.springboot.jooqGenerated.tables.records.MovieRecord;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row13;
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
public class Movie extends TableImpl<MovieRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>movies.movie</code>
     */
    public static final Movie MOVIE = new Movie();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MovieRecord> getRecordType() {
        return MovieRecord.class;
    }

    /**
     * The column <code>movies.movie.movie_id</code>.
     */
    public final TableField<MovieRecord, Integer> MOVIE_ID = createField(DSL.name("movie_id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>movies.movie.title</code>.
     */
    public final TableField<MovieRecord, String> TITLE = createField(DSL.name("title"), SQLDataType.VARCHAR(1000), this, "");

    /**
     * The column <code>movies.movie.budget</code>.
     */
    public final TableField<MovieRecord, Integer> BUDGET = createField(DSL.name("budget"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>movies.movie.homepage</code>.
     */
    public final TableField<MovieRecord, String> HOMEPAGE = createField(DSL.name("homepage"), SQLDataType.VARCHAR(1000), this, "");

    /**
     * The column <code>movies.movie.overview</code>.
     */
    public final TableField<MovieRecord, String> OVERVIEW = createField(DSL.name("overview"), SQLDataType.VARCHAR(1000), this, "");

    /**
     * The column <code>movies.movie.popularity</code>.
     */
    public final TableField<MovieRecord, BigDecimal> POPULARITY = createField(DSL.name("popularity"), SQLDataType.DECIMAL(12, 6), this, "");

    /**
     * The column <code>movies.movie.release_date</code>.
     */
    public final TableField<MovieRecord, LocalDate> RELEASE_DATE = createField(DSL.name("release_date"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>movies.movie.revenue</code>.
     */
    public final TableField<MovieRecord, Long> REVENUE = createField(DSL.name("revenue"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>movies.movie.runtime</code>.
     */
    public final TableField<MovieRecord, Integer> RUNTIME = createField(DSL.name("runtime"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>movies.movie.movie_status</code>.
     */
    public final TableField<MovieRecord, String> MOVIE_STATUS = createField(DSL.name("movie_status"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>movies.movie.tagline</code>.
     */
    public final TableField<MovieRecord, String> TAGLINE = createField(DSL.name("tagline"), SQLDataType.VARCHAR(1000), this, "");

    /**
     * The column <code>movies.movie.vote_average</code>.
     */
    public final TableField<MovieRecord, BigDecimal> VOTE_AVERAGE = createField(DSL.name("vote_average"), SQLDataType.DECIMAL(4, 2), this, "");

    /**
     * The column <code>movies.movie.vote_count</code>.
     */
    public final TableField<MovieRecord, Integer> VOTE_COUNT = createField(DSL.name("vote_count"), SQLDataType.INTEGER, this, "");

    private Movie(Name alias, Table<MovieRecord> aliased) {
        this(alias, aliased, null);
    }

    private Movie(Name alias, Table<MovieRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>movies.movie</code> table reference
     */
    public Movie(String alias) {
        this(DSL.name(alias), MOVIE);
    }

    /**
     * Create an aliased <code>movies.movie</code> table reference
     */
    public Movie(Name alias) {
        this(alias, MOVIE);
    }

    /**
     * Create a <code>movies.movie</code> table reference
     */
    public Movie() {
        this(DSL.name("movie"), null);
    }

    public <O extends Record> Movie(Table<O> child, ForeignKey<O, MovieRecord> key) {
        super(child, key, MOVIE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Movies.MOVIES;
    }

    @Override
    public Identity<MovieRecord, Integer> getIdentity() {
        return (Identity<MovieRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<MovieRecord> getPrimaryKey() {
        return Keys.KEY_MOVIE_PRIMARY;
    }

    @Override
    public Movie as(String alias) {
        return new Movie(DSL.name(alias), this);
    }

    @Override
    public Movie as(Name alias) {
        return new Movie(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Movie rename(String name) {
        return new Movie(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Movie rename(Name name) {
        return new Movie(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<Integer, String, Integer, String, String, BigDecimal, LocalDate, Long, Integer, String, String, BigDecimal, Integer> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}