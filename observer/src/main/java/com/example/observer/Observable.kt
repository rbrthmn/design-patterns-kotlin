package com.example.observer

abstract class Observable {
    private val listeners: MutableList<Observer> = mutableListOf()

    fun subscribe(observer: Observer) {
        listeners.add(observer)
    }

    fun unsubscribe(observer: Observer) {
        listeners.remove(observer)
    }

    fun notify(data: Any) {
        listeners.forEach {
            it.update(data)
        }
    }
}