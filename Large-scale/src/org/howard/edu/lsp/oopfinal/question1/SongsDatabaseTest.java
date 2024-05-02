package org.howard.edu.lsp.oopfinal.question1;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class SongsDatabaseTest {

    @Test
    public void testAddSong() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        Set<String> rapSongs = db.getSongs("Rap");
        assertTrue(rapSongs.contains("Savage"));
    }

    @Test
    public void testGetGenreOfSong() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        assertEquals("Rap", db.getGenreOfSong("Savage"));
    }

    @Test
    public void testGetSongs() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Jazz", "Always There");
        Set<String> jazzSongs = db.getSongs("Jazz");
        assertTrue(jazzSongs.contains("Always There"));
    }

    // Additional test case for ensuring an empty set is returned for a genre with no songs
    @Test
    public void testGetSongsForEmptyGenre() {
        SongsDatabase db = new SongsDatabase();
        Set<String> emptySongs = db.getSongs("Rock");
        assertTrue(emptySongs.isEmpty());
    }
}
