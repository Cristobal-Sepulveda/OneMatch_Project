package com.example.android.onematchproject.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.android.onematchproject.data.dbo.MatchDBO

/**
 * Data Access Object for the matches table.
 */
@Dao
interface MatchesDao {

    /**
     * @return all Matches in the DB.
     */
    @Query("SELECT * FROM matches")
    fun getMatches(): List<MatchDBO>

    /**
     * @param matchDBOId the id of the MatchDBIO
     * @return the matchDBO object with the matchDBOId
     */
    @Query("SELECT * FROM matches where entry_id = :matchDBOId")
    fun getMatchById(matchDBOId: Long): MatchDBO?

    /**
     * Insert a MatchDBO in the database. If the MatchDBO already exists, replace it.
     *
     * @param matchDBO the reminder to be inserted.
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveMatchDBO(matchDBO: MatchDBO)

    /**
     * Delete all matchDBO's.
     */
    @Query("DELETE FROM matches")
    fun deleteAllMatches()

}