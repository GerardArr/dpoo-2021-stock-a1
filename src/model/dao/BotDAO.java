package model.dao;

import model.entity.Bot;

import java.util.List;

public interface BotDAO {

    /**
     * Method that saves a specific bot, persisting it.
     *
     * @param bot The new bot to save.
     */
    void addBot(Bot bot);

    /**
     * Method that reads the persisted information, returning all stored bots.
     *
     * @return A list containing all persisted bots.
     */
    List<Bot> getAllBots();

}
