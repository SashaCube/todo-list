package com.oleksandr.havryliuk.todo_list.auth.signup;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.oleksandr.havryliuk.todo_list.R;
import com.oleksandr.havryliuk.todo_list.auth.IAuthModel;

public class SignUpFragment extends Fragment {

    private SignUpContract.ISignUpView view;
    private SignUpContract.ISignUpPresenter presenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_signup, container, false);

        initView(root);
        initPresenter();

        return root;
    }

    private void initView(View root) {
        view = new SignUpView();
        view.init(root);
    }

    private void initPresenter() {
        presenter = new SignUpPresenter((IAuthModel) getActivity(), view);
        view.setPresenter(presenter);
    }
}


