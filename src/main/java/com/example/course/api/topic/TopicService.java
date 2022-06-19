package com.example.course.api.topic;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring", "spring framework", "spring framework description"),
            new Topic("java", "core java", "core java description"),
            new Topic("javascript", "javascript", "javascript description")));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        for (Topic topic : topics) {
            if (topic.getId().equals(id))
                return topic;
        }
        return null;
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
        System.out.println("Topic added successfully in topic list! :)");
    }

    public Topic updateTopic(Topic topic, String id) {
        for (int i = 0; i < topics.size(); i++) {
            if (topics.get(i).getId().equals(id)) {
                topics.add(i, topic);
                return topics.get(i);
            }
        }
        return null;
    }

    public void deleteTopic(String id) {
        for (int i = 0; i < topics.size(); i++) {
            if (topics.get(i).getId().equals(id)) {
                topics.remove(i);
                return;
            }
        }
    }
}
