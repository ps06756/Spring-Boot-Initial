/*
 * This file is generated by jOOQ.
 */
package com.example.springboot.jooqGenerated.tables.records;


import com.example.springboot.jooqGenerated.tables.MovieKeywords;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MovieKeywordsRecord extends TableRecordImpl<MovieKeywordsRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>movies.movie_keywords.movie_id</code>.
     */
    public void setMovieId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>movies.movie_keywords.movie_id</code>.
     */
    public Integer getMovieId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>movies.movie_keywords.keyword_id</code>.
     */
    public void setKeywordId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>movies.movie_keywords.keyword_id</code>.
     */
    public Integer getKeywordId() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return MovieKeywords.MOVIE_KEYWORDS.MOVIE_ID;
    }

    @Override
    public Field<Integer> field2() {
        return MovieKeywords.MOVIE_KEYWORDS.KEYWORD_ID;
    }

    @Override
    public Integer component1() {
        return getMovieId();
    }

    @Override
    public Integer component2() {
        return getKeywordId();
    }

    @Override
    public Integer value1() {
        return getMovieId();
    }

    @Override
    public Integer value2() {
        return getKeywordId();
    }

    @Override
    public MovieKeywordsRecord value1(Integer value) {
        setMovieId(value);
        return this;
    }

    @Override
    public MovieKeywordsRecord value2(Integer value) {
        setKeywordId(value);
        return this;
    }

    @Override
    public MovieKeywordsRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MovieKeywordsRecord
     */
    public MovieKeywordsRecord() {
        super(MovieKeywords.MOVIE_KEYWORDS);
    }

    /**
     * Create a detached, initialised MovieKeywordsRecord
     */
    public MovieKeywordsRecord(Integer movieId, Integer keywordId) {
        super(MovieKeywords.MOVIE_KEYWORDS);

        setMovieId(movieId);
        setKeywordId(keywordId);
    }
}