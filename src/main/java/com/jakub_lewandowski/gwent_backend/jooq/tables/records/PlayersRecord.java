/*
 * This file is generated by jOOQ.
 */
package com.jakub_lewandowski.gwent_backend.jooq.tables.records;


import com.jakub_lewandowski.gwent_backend.jooq.tables.Players;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PlayersRecord extends UpdatableRecordImpl<PlayersRecord> implements Record7<Long, String, Integer, Integer, Integer, Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.players.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.players.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.players.username</code>.
     */
    public void setUsername(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.players.username</code>.
     */
    public String getUsername() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.players.sprite</code>.
     */
    public void setSprite(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.players.sprite</code>.
     */
    public Integer getSprite() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.players.wins</code>.
     */
    public void setWins(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.players.wins</code>.
     */
    public Integer getWins() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.players.losses</code>.
     */
    public void setLosses(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.players.losses</code>.
     */
    public Integer getLosses() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.players.x_pos</code>.
     */
    public void setXPos(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.players.x_pos</code>.
     */
    public Integer getXPos() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.players.y_pos</code>.
     */
    public void setYPos(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.players.y_pos</code>.
     */
    public Integer getYPos() {
        return (Integer) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, String, Integer, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Long, String, Integer, Integer, Integer, Integer, Integer> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Players.PLAYERS.ID;
    }

    @Override
    public Field<String> field2() {
        return Players.PLAYERS.USERNAME;
    }

    @Override
    public Field<Integer> field3() {
        return Players.PLAYERS.SPRITE;
    }

    @Override
    public Field<Integer> field4() {
        return Players.PLAYERS.WINS;
    }

    @Override
    public Field<Integer> field5() {
        return Players.PLAYERS.LOSSES;
    }

    @Override
    public Field<Integer> field6() {
        return Players.PLAYERS.X_POS;
    }

    @Override
    public Field<Integer> field7() {
        return Players.PLAYERS.Y_POS;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getUsername();
    }

    @Override
    public Integer component3() {
        return getSprite();
    }

    @Override
    public Integer component4() {
        return getWins();
    }

    @Override
    public Integer component5() {
        return getLosses();
    }

    @Override
    public Integer component6() {
        return getXPos();
    }

    @Override
    public Integer component7() {
        return getYPos();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getUsername();
    }

    @Override
    public Integer value3() {
        return getSprite();
    }

    @Override
    public Integer value4() {
        return getWins();
    }

    @Override
    public Integer value5() {
        return getLosses();
    }

    @Override
    public Integer value6() {
        return getXPos();
    }

    @Override
    public Integer value7() {
        return getYPos();
    }

    @Override
    public PlayersRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public PlayersRecord value2(String value) {
        setUsername(value);
        return this;
    }

    @Override
    public PlayersRecord value3(Integer value) {
        setSprite(value);
        return this;
    }

    @Override
    public PlayersRecord value4(Integer value) {
        setWins(value);
        return this;
    }

    @Override
    public PlayersRecord value5(Integer value) {
        setLosses(value);
        return this;
    }

    @Override
    public PlayersRecord value6(Integer value) {
        setXPos(value);
        return this;
    }

    @Override
    public PlayersRecord value7(Integer value) {
        setYPos(value);
        return this;
    }

    @Override
    public PlayersRecord values(Long value1, String value2, Integer value3, Integer value4, Integer value5, Integer value6, Integer value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PlayersRecord
     */
    public PlayersRecord() {
        super(Players.PLAYERS);
    }

    /**
     * Create a detached, initialised PlayersRecord
     */
    public PlayersRecord(Long id, String username, Integer sprite, Integer wins, Integer losses, Integer xPos, Integer yPos) {
        super(Players.PLAYERS);

        setId(id);
        setUsername(username);
        setSprite(sprite);
        setWins(wins);
        setLosses(losses);
        setXPos(xPos);
        setYPos(yPos);
    }
}
