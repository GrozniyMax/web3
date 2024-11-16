package com.web.primefacesexampletest.database;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.LinkedList;
import java.util.List;

@ApplicationScoped
public class TestRequestRepositoryImpl implements RequestsRepository{

    private List<Request> requests = new LinkedList<>();
    private long id;

    @Override
    public List<Request> findAll() {
        return requests;
    }

    @Override
    public void save(Request request) {
        request.setId(id++);
        System.out.println("Saving" + request);
        requests.add(request);
    }

    @Override
    public List<Request> findSome(int count) {
        return  requests;
    }

    @Override
    public List<Request> findAllHited() {
        return requests.stream().filter(Request::getHit).toList();
    }

    @Override
    public List<Request> findAllHitAndR(Float r) {
        return requests.stream().filter(Request::getHit).toList();
    }
}
