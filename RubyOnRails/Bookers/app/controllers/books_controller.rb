class BooksController < ApplicationController
  before_action :authenticate_user!, only: [:index,:show,:new,:create,:edit,:update]
  
  def index
    @books = Book.all
    @book = Book.new
    @login_user = User.find(current_user.id)
  end
  
  def show
    @book = Book.find(params[:id])
    @book_new = Book.new
    @user = @book.user
  end
  
  def new
    # 今回も新規投稿フォームはusers/showの一覧画面の一部に設置するためnewアクションはおやすみ。
  end
  
  def create
    @book = Book.new(book_params)
    @book.user_id = current_user.id
    if @book.save
      redirect_to book_path(@book.id)
      flash[:notice] = "You have creatad book successfully."
    else
      @books = Book.all
      render :index
    end
  end
  
  def edit
    @book = Book.find(params[:id])
    @user = @book.user
    unless @user.id == current_user.id
      redirect_to books_path
    end
  end
  
  def update
    @book = Book.find(params[:id])
    if @book.update(book_params)
      flash[:notice] = "You have updated book successfully."
      redirect_to book_path(@book.id)
    else
      render :edit
    end
  end
  
  def destroy
    @book = Book.find(params[:id])
    @book.destroy
    redirect_to books_path
  end
  
  private
  def book_params
    params.require(:book).permit(:title, :body)
  end
end
