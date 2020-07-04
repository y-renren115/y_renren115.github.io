Rails.application.routes.draw do
  # For details on the DSL available within this file, see http://guides.rubyonrails.org/routing.html
  get 'neotters' => 'neotters#index'
  get 'neotters/new' => 'neotters#new'
  post 'neotters/create' => 'neotters#create'
end
