package am.ACA.controller;

import am.ACA.model.User;
import am.ACA.model.Util.InvalidArgumentException;
import am.ACA.model.Util.Util;
import am.ACA.repository.*;
import am.ACA.repository.interfacemetods.RepositoryInt;
import am.ACA.repository.interfacemetods.TrackRepositoryInt;

import java.util.Scanner;

/**
 * Created by Karen on 9/6/2016.
 */

public class Controller implements ControllerInt {

    private Scanner scanner = new Scanner(System.in);
    private String commandLine;

    private RepositoryInt userRepository = new UserRepository();
    private RepositoryInt albumRepository = new AlbumRepository();
    private RepositoryInt playListRepository = new PlayListRepository();
    private RepositoryInt musicRepository = new MusicRepository();
    private TrackRepositoryInt trackRepository = new TrackRepository();

    @Override
    public String onClickButton() {
        commandLine = scanner.nextLine();
        return commandLine;

    }

    @Override
    public void signIn() {

    }

    @Override
    public void signUp() {
        String login;
        String password;
        Util.printMessage("Please write login");
        login = onClickButton();
        Util.printMessage("Please write password");
        password = onClickButton();

        if (!login.equals(null) && !password.equals(null)) {
            User user = new User();
            try {

                userRepository.add(user);
            } catch (InvalidArgumentException e) {
                e.printStackTrace();
            }
        }

    }


    @Override
    public void start() {
        switch (onClickButton()) {
            case "Sign In":
                signIn();
                start();
                break;
            case "Sign Up":
                signUp();
                start();
                break;
            case "play":
                play();
                start();
                break;
            case "pause":
                pause();
                start();
                break;
            case "stop":
                stop();
                start();
                break;
            case "Show Playlist":
                viewPlaylist();
                start();
                break;
            case "Add Music":
                addMusic();
                start();
                break;
            case "Add Album":
                addAlbum();
                start();
                break;
            case "Delete Music":
                deleteMusic();
                start();
                break;
            case "Delete Album":
                deleteAlbum();
                start();
                break;
            case "help":
                deleteAlbum();
                start();
                break;
            case "exit":
                exit();
                break;
            default:
                onClickButton();
                break;
        }
    }


    @Override
    public void play() {


    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void addMusic() {

    }

    @Override
    public void addAlbum() {

    }

    @Override
    public void deleteMusic() {

    }

    @Override
    public void deleteAlbum() {

    }

    @Override
    public void viewPlaylist() {

    }

    @Override
    public void help() {

    }

    @Override
    public void exit() {
        Util.printMessage("Good bay");
        System.exit(0);
    }
}
