/*
 * This file is generated by jOOQ.
 */
package com.example.springboot.jooqGenerated.tables.records;


import com.example.springboot.jooqGenerated.tables.Country;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CountryRecord extends UpdatableRecordImpl<CountryRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>movies.country.country_id</code>.
     */
    public void setCountryId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>movies.country.country_id</code>.
     */
    public Integer getCountryId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>movies.country.country_iso_code</code>.
     */
    public void setCountryIsoCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>movies.country.country_iso_code</code>.
     */
    public String getCountryIsoCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>movies.country.country_name</code>.
     */
    public void setCountryName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>movies.country.country_name</code>.
     */
    public String getCountryName() {
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
        return Country.COUNTRY.COUNTRY_ID;
    }

    @Override
    public Field<String> field2() {
        return Country.COUNTRY.COUNTRY_ISO_CODE;
    }

    @Override
    public Field<String> field3() {
        return Country.COUNTRY.COUNTRY_NAME;
    }

    @Override
    public Integer component1() {
        return getCountryId();
    }

    @Override
    public String component2() {
        return getCountryIsoCode();
    }

    @Override
    public String component3() {
        return getCountryName();
    }

    @Override
    public Integer value1() {
        return getCountryId();
    }

    @Override
    public String value2() {
        return getCountryIsoCode();
    }

    @Override
    public String value3() {
        return getCountryName();
    }

    @Override
    public CountryRecord value1(Integer value) {
        setCountryId(value);
        return this;
    }

    @Override
    public CountryRecord value2(String value) {
        setCountryIsoCode(value);
        return this;
    }

    @Override
    public CountryRecord value3(String value) {
        setCountryName(value);
        return this;
    }

    @Override
    public CountryRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CountryRecord
     */
    public CountryRecord() {
        super(Country.COUNTRY);
    }

    /**
     * Create a detached, initialised CountryRecord
     */
    public CountryRecord(Integer countryId, String countryIsoCode, String countryName) {
        super(Country.COUNTRY);

        setCountryId(countryId);
        setCountryIsoCode(countryIsoCode);
        setCountryName(countryName);
    }
}
