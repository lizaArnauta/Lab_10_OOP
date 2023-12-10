package ua.edu.ucu.apps;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TimedDocument implements Document{
    private String path;
    @Override
    public String parse() {
        long startTime = System.currentTimeMillis();
        String text = new SmartDocument(path).parse();
        return (System.currentTimeMillis() - startTime) + " milliseconds\n" + text;
    }
}