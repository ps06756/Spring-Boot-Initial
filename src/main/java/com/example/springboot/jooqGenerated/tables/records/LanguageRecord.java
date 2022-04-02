/*
 * This file is generated by jOOQ.
 */
package com.example.springboot.jooqGenerated.tables.records;


import com.example.springboot.jooqGenerated.tables.Language;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LanguageRecord extends UpdatableRecordImpl<LanguageRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>movies.language.language_id</code>.
     */
    public void setLanguageId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>movies.language.language_id</code>.
     */
    public Integer getLanguageId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>movies.language.language_code</code>.
     */
    public void setLanguageCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>movies.language.language_code</code>.
     */
    public String getLanguageCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>movies.language.language_name</code>.
     */
    public void setLanguageName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>movies.language.language_name</code>.
     */
    public String getLanguageName() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Language.LANGUAGE.LANGUAGE_ID;
    }

    @Override
    public Field<String> field2() {
        return Language.LANGUAGE.LANGUAGE_CODE;
    }

    @Override
    public Field<String> field3() {
        return Language.LANGUAGE.LANGUAGE_NAME;
    }

    @Override
    public Integer component1() {
        return getLanguageId();
    }

    @Override
    public String component2() {
        return getLanguageCode();
    }

    @Override
    public String component3() {
        return getLanguageName();
    }

    @Override
    public Integer value1() {
        return getLanguageId();
    }

    @Override
    public String value2() {
        return getLanguageCode();
    }

    @Override
    public String value3() {
        return getLanguageName();
    }

    @Override
    public LanguageRecord value1(Integer value) {
        setLanguageId(value);
        return this;
    }

    @Override
    public LanguageRecord value2(String value) {
        setLanguageCode(value);
        return this;
    }

    @Override
    public LanguageRecord value3(String value) {
        setLanguageName(value);
        return this;
    }

    @Override
    public LanguageRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LanguageRecord
     */
    public LanguageRecord() {
        super(Language.LANGUAGE);
    }

    /**
     * Create a detached, initialised LanguageRecord
     */
    public LanguageRecord(Integer languageId, String languageCode, String languageName) {
        super(Language.LANGUAGE);

        setLanguageId(languageId);
        setLanguageCode(languageCode);
        setLanguageName(languageName);
    }
}
