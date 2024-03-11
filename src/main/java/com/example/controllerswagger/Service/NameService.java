package com.example.controllerswagger.Service;

import org.springframework.stereotype.Service;

@Service
public class NameService {
    public StringBuilder reverseName(String name) {
        StringBuilder nameReversed = new StringBuilder(name);
        return nameReversed.reverse();
    }
}
