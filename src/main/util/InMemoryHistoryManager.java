package main.util;

import main.task.Node;
import main.task.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InMemoryHistoryManager implements HistoryManager {

    //поиск задач в истории обращения
    private HashMap<Integer, Node<Task>> nodeId = new HashMap<>();

    // первый узел двусвязного списка
    private Node<Task> head;

    // последний узел двусвязного списка
    private Node<Task> tail;

    @Override
    public void add(Task task) {
        Node<Task> t = tail;
        Node<Task> newNode = null;
        if (nodeId.containsKey(task.getId())) {
            newNode = nodeId.get(task.getId());
            unLink(newNode);
        } else {
            newNode = new Node(task, null, t);
            nodeId.put(task.getId(), newNode);
        }
        includeNodeEndList(newNode);
    }

    // удаление просмотра из истории
    @Override
    public void remove(int id) {
        Node<Task> delNode = nodeId.get(id);
        unLink(delNode);
        nodeId.remove(id);
    }

    // получение истории последних просмотров
    @Override
    public List<Task> getHistory() {
        List<Task> rsl = new ArrayList<>();
        for (Node<Task> i = head; i != null; i = i.getNext()) {
            rsl.add(i.getItem());
        }
        return rsl;
    }

    // выключение узла из списка
    private void unLink(Node<Task> node) {
        Node<Task> prev = node.getPrev();
        Node<Task> next = node.getNext();
        if (prev == null) {
            head = next;
        } else {
            prev.setNext(next);
            node.setPrev(null);
        }
        if (next == null) {
            tail = prev;
        } else {
            next.setPrev(prev);
            node.setNext(null);
        }
    }

    //включение узла в конец списка
    private void includeNodeEndList(Node<Task> node) {
        Node<Task> t = tail;
        tail = node;
        if (t == null)
            head = node;
        else
            t.setNext(node);
        node.setPrev(t);
    }

    // очистка истории
    public void clear() {
        nodeId.clear();
        head = null;
        tail = null;
    }
}
