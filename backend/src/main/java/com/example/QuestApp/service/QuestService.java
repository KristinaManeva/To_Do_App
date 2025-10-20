package com.example.QuestApp.service;

import com.example.QuestApp.model.Quest;

import java.util.List;

public interface QuestService {

    List<Quest> getAllQuests(String sort, boolean importantFilter, String search);

    default List<Quest> getAllQuests(String sort, Boolean importantFilter, String search) {
        return getAllQuests(sort, Boolean.TRUE.equals(importantFilter), search);
    }

    Quest createQuest(Quest quest);

    Quest updateQuest(int id, Quest newQuest) throws Exception;

    void deleteQuest(int id) throws Exception;

    Quest getQuestById(int id) throws Exception;
}
